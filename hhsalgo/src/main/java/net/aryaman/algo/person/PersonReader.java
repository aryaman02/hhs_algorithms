package net.aryaman.algo.person;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonReader {

    /*
     * List of commands
     */
    private static final List<String> commands = Arrays.asList("add", "show", "showAll");

    /*
     * Map of ID->Person. Store Person objects.
     */
    private Map<String, Person> profile = new HashMap<>();

    private BufferedReader in = null;
    /*
     * File Handle
     */
    private File f = null;

    private BufferedWriter writer = null;

    private ObjectMapper mapper = null;

    public static void main(String[] args) throws IOException {
        PersonReader reader = new PersonReader();

        reader.initialize();
        reader.readCommands();
        reader.cleanup();
    }

    private void initialize() throws IOException {

        f = new File("/Users/aryamandas/testarea/persons.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(f, true);
        writer = new BufferedWriter(fileWriter);
        mapper = new ObjectMapper();

        in = new BufferedReader(new InputStreamReader(System.in));

        loadPersonsFromFile();
    }

    private void cleanup() throws IOException {
        in.close();
        writer.close();
    }

    public void readCommands() throws IOException {
        while (true) {
            System.out.println("Enter the command. Type quit to Quit");
            String command = in.readLine();

            if (command.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye");
                break;
            } else if (command.equalsIgnoreCase("add")) {
                addPerson(in);
            } else if (command.equalsIgnoreCase("show")) {
                showPerson(in);
            } else if (command.equalsIgnoreCase("showAll")) {
                showAll(in);
            } else {
                System.out.println("unknown command");
                continue;
            }
        }
    }

    private void addPerson(BufferedReader in) throws IOException {
        System.out.println("Enter the person details");
        String input = in.readLine();

        String[] inputArray = input.split(" ");
        if (inputArray.length != 6) {
            System.out.println("Incorrect number of inputs");
        }
        String id = inputArray[0];
        String firstName = inputArray[1];
        String lastName = inputArray[2];
        String social = inputArray[3];
        String address = inputArray[4];
        int age = Integer.valueOf(inputArray[5]);

        Person p = new Person(id, firstName, lastName, social, address, age);
        profile.put(id, p);
        //profile.put(p.getId(), p);

        System.out.println("The person with id " + id + " was added to the map");

        storeData(p);
        System.out.println("The person with id " + id + " was stored in the file");
    }

    private void showPerson(BufferedReader in) throws IOException {
        System.out.println("Enter the person ID");
        String id = in.readLine();

        Person p = profile.get(id);

        if (p == null) {
            System.out.println("The person with id " + id + " doesn't exist");
        } else {
            System.out.println(p.toString());

        }
    }

    private void showAll(BufferedReader in) throws IOException {
        for (Entry<String, Person> entry : profile.entrySet()) {
            Person p = entry.getValue();
            System.out.println(p.toString());
        }
    }

    private void storeData(Person p) throws JsonGenerationException, JsonMappingException, IOException {
        String jsonPerson = mapper.writeValueAsString(p);
        writer.write(jsonPerson);
        writer.newLine();
        writer.flush();
    }

    private void loadPersonsFromFile() throws IOException {
        FileInputStream is = new FileInputStream("/Users/aryamandas/testarea/persons.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        while (true) {
            String json = reader.readLine();
            if (json == null) {
                /*
                 * reached EOF
                 */
                break;
            }
            Person p = mapper.readValue(json, Person.class);
            String id = p.getId();
            profile.put(id, p);
        }

        reader.close();
    }
}

package net.aryaman.algo.hhs9;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class R3A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        Set<Integer> vals = new HashSet<>();
        char[] sArray = s.toCharArray();
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;
        int gCount = 0;
        int hCount = 0;
        int iCount = 0;
        int jCount = 0;
        int kCount = 0;
        int lCount = 0;
        int mCount = 0;
        int nCount = 0;
        int oCount = 0;
        int pCount = 0;
        int qCount = 0;
        int rCount = 0;
        int sCount = 0;
        int tCount = 0;
        int uCount = 0;
        int vCount = 0;
        int wCount = 0;
        int xCount = 0;
        int yCount = 0;
        int zCount = 0;

        for (int i = 0; i < sArray.length-1; i++) {
            if (sArray[i] == 'a') {
                aCount+=1;
                vals.add(aCount);
                if (sArray[i+1] != 'a') {
                    aCount = 0;
                }
            } else if (sArray[i] == 'b') {
                bCount+=2;
                vals.add(bCount);
                if (sArray[i+1] != 'b') {
                    bCount = 0;
                }
            } else if (sArray[i] == 'c') {
                cCount+=3;
                vals.add(cCount);
                if (sArray[i+1] != 'c') {
                    cCount = 0;
                }
            } else if (sArray[i] == 'd') {
                dCount+=4;
                vals.add(dCount);
                if (sArray[i+1] != 'd') {
                    dCount = 0;
                }
            } else if (sArray[i] == 'e') {
                eCount+=5;
                vals.add(eCount);
                if (sArray[i+1] != 'e') {
                    eCount = 0;
                }
            } else if (sArray[i] == 'f') {
                fCount+=6;
                vals.add(fCount);
                if (sArray[i+1] != 'f') {
                    fCount = 0;
                }
            } else if (sArray[i] == 'g') {
                gCount+=7;
                vals.add(gCount);
                if (sArray[i+1] != 'g') {
                    gCount = 0;
                }
            } else if (sArray[i] == 'h') {
                hCount+=8;
                vals.add(hCount);
                if (sArray[i+1] != 'h') {
                    hCount = 0;
                }
            } else if (sArray[i] == 'i') {
                iCount+=9;
                vals.add(iCount);
                if (sArray[i+1] != 'i') {
                    iCount = 0;
                }
            } else if (sArray[i] == 'j') {
                jCount+=10;
                vals.add(jCount);
                if (sArray[i+1] != 'j') {
                    jCount = 0;
                }
            } else if (sArray[i] == 'k') {
                kCount+=11;
                vals.add(kCount);
                if (sArray[i+1] != 'k') {
                    kCount = 0;
                }
            } else if (sArray[i] == 'l') {
                lCount+=12;
                vals.add(lCount);
                if (sArray[i+1] != 'l') {
                    lCount = 0;
                }
            } else if (sArray[i] == 'm') {
                mCount+=13;
                vals.add(mCount);
                if (sArray[i+1] != 'm') {
                    mCount = 0;
                }
            } else if (sArray[i] == 'n') {
                nCount+=14;
                vals.add(nCount);
                if (sArray[i+1] != 'n') {
                    nCount = 0;
                }
            } else if (sArray[i] == 'o') {
                oCount+=15;
                vals.add(oCount);
                if (sArray[i+1] != 'o') {
                    oCount = 0;
                }
            } else if (sArray[i] == 'p') {
                pCount+=16;
                vals.add(pCount);
                if (sArray[i+1] != 'p') {
                    pCount = 0;
                }
            } else if (sArray[i] == 'q') {
                qCount+=17;
                vals.add(qCount);
                if (sArray[i+1] != 'q') {
                    qCount = 0;
                }
            } else if (sArray[i] == 'r') {
                rCount+=18;
                vals.add(rCount);
                if (sArray[i+1] != 'r') {
                    rCount = 0;
                }
            } else if (sArray[i] == 's') {
                sCount+=19;
                vals.add(sCount);
                if (sArray[i+1] != 's') {
                    sCount = 0;
                }
            } else if (sArray[i] == 't') {
                tCount+=20;
                vals.add(tCount);
                if (sArray[i+1] != 't') {
                    tCount = 0;
                }
            } else if (sArray[i] == 'u') {
                uCount+=21;
                vals.add(uCount);
                if (sArray[i+1] != 'u') {
                    uCount = 0;
                }
            } else if (sArray[i] == 'v') {
                vCount+=22;
                vals.add(vCount);
                if (sArray[i+1] != 'v') {
                    vCount = 0;
                }
            } else if (sArray[i] == 'w') {
                wCount+=23;
                vals.add(wCount);
                if (sArray[i+1] != 'w') {
                    wCount = 0;
                }
            } else if (sArray[i] == 'x') {
                xCount+=24;
                vals.add(xCount);
                if (sArray[i+1] != 'x') {
                    xCount = 0;
                }
            } else if (sArray[i] == 'y') {
                yCount+=25;
                vals.add(yCount);
                if (sArray[i+1] != 'y') {
                    yCount = 0;
                }
            } else if (sArray[i] == 'z') {
                zCount+=26;
                vals.add(zCount);
                if (sArray[i+1] != 'z') {
                    zCount = 0;
                }
            }
        }
        if (sArray[sArray.length-1] == 'e') {
            vals.add(5);
        }
        if (sArray[sArray.length-1] == 'a') {
            vals.add(1);
        }if (sArray[sArray.length-1] == 'b') {
            vals.add(2);
        }if (sArray[sArray.length-1] == 'c') {
            vals.add(3);
        }if (sArray[sArray.length-1] == 'd') {
            vals.add(4);
        }if (sArray[sArray.length-1] == 'f') {
            vals.add(6);
        }if (sArray[sArray.length-1] == 'g') {
            vals.add(7);
        }if (sArray[sArray.length-1] == 'h') {
            vals.add(8);
        }if (sArray[sArray.length-1] == 'i') {
            vals.add(9);
        }if (sArray[sArray.length-1] == 'j') {
            vals.add(10);
        }if (sArray[sArray.length-1] == 'k') {
            vals.add(11);
        }if (sArray[sArray.length-1] == 'l') {
            vals.add(12);
        }if (sArray[sArray.length-1] == 'm') {
            vals.add(13);
        }if (sArray[sArray.length-1] == 'n') {
            vals.add(14);
        }if (sArray[sArray.length-1] == 'o') {
            vals.add(15);
        }if (sArray[sArray.length-1] == 'p') {
            vals.add(16);
        }if (sArray[sArray.length-1] == 'q') {
            vals.add(17);
        }if (sArray[sArray.length-1] == 'r') {
            vals.add(18);
        }if (sArray[sArray.length-1] == 's') {
            vals.add(19);
        }if (sArray[sArray.length-1] == 't') {
            vals.add(20);
        }if (sArray[sArray.length-1] == 'u') {
            vals.add(21);
        }if (sArray[sArray.length-1] == 'v') {
            vals.add(22);
        }if (sArray[sArray.length-1] == 'w') {
            vals.add(23);
        }if (sArray[sArray.length-1] == 'x') {
            vals.add(24);
        }
        if (sArray[sArray.length-1] == 'y') {
            vals.add(25);
        }
        if (sArray[sArray.length-1] == 'z') {
            vals.add(26);
        }
        for (int j = 0; j < n; j++) {
            int x = in.nextInt();
            if (vals.contains(x)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

import java.util.Locale;

public class Test {

        public static void main(String[] args) {

            String a = "in girum imus nocte et consumimur igni".toLowerCase();
            byte lim = (byte) a.length();
            boolean risultato = true;

                    for(byte i=0; i<lim/2;i++) {
                        if(a.charAt(i) != a.charAt(lim-i-1)) {
                            System.out.println("La parola è palindroma");
                            risultato = false;
                            break;
                        }
                    }
            if (risultato) {
                System.out.println(("La parola non è palindroma"));
            }
        }

    }

package patikaProjeler.basitProjeler;
import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int gun, ay;
        String burc = "" ;
        boolean isEroor = false;

        System.out.print("Doğduğunuz ay: ");
        ay = inp.nextInt();

        System.out.print("Doğduğunuz gün: ");
        gun = inp.nextInt();

        if(ay == 1){
            if(gun >= 1 && gun <= 31){
                if(gun <=21){
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            }
            else {
                isEroor = true;
            }
        }
        if(ay == 2){
            if(gun >= 1 && gun <= 30){
                if(gun <= 19){
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            }
            else {
                isEroor = true;
            }
        }
        if(ay == 3){
            if(gun >= 1 && gun <= 31){
                if(gun <= 20){
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            }
            else {
                isEroor = true;
            }
        }
        if(ay == 4){
            if(gun >= 1 && gun <= 30 ){
                if(gun <= 20){
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            }
            else {
                isEroor = true;
            }
        }
        if(ay == 5){
            if(gun >= 1 && gun <= 31){
                if(gun <= 21){
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            }
            else {
                isEroor = true;
            }
        }
        if(ay == 6){
            if(gun >= 1 && gun <= 30){
                if(gun <= 22){
                    burc = "İkizler";
                } else {
                    burc = "Yengec";
                }
            } else {
                isEroor = true;
            }
        }
        if(ay == 7){
            if(gun >=1 && gun <= 31){
                if(gun <= 22){
                    burc = "Yengec";
                } else {
                    burc = "Aslan";
                }
            } else {
                isEroor = true;
            }
        }
        if(ay == 8){
            if(gun >= 1 && gun <= 31){
                if(gun <= 22){
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isEroor = true;
            }
        }
        if(ay == 9){
            if(gun >= 1 && gun <= 30){
                if(gun <= 22){
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isEroor = true;
            }
        }
        if(ay == 10){
            if(gun >= 1 && gun <= 31){
                if(gun <= 22){
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isEroor = true;
            }
        }
        if(ay == 11){
            if(gun >= 1 && gun <= 30){
                if(gun <= 21){
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isEroor = true;
            }
        }
        if(ay == 12){
            if(gun >= 1 && gun <= 31){
                if(gun <= 21){
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isEroor = true;
            }
        }
        else {
            isEroor = true;
        }

        if(isEroor){
            System.out.print("Hatalı giriş yaptınız tekrar deneyin! ");
        } else {
            System.out.print("Burcunuz: " + burc);
        }
        
        
    }
    
}

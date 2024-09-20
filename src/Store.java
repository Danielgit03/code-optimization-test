public class Store {
    public static void main(String[] args) {

       final int PRICE1 = 15;
        final int PRICE2 = 10;
       final int PRICE3 = 5;


        final int CANT1 = 2;
        final int CANT2 = 3;
        final int CANT3 = 4;

       final int VENTAS_ESCALON= 50;

      

        

int []  PRICES ={ PRICE1,PRICE2,PRICE3} ;
int []  CANTIDADES = { CANT1,CANT2,CANT3};

if (PRICES.length != CANTIDADES.length){

throw new IllegalArgumentException("Precios y cantidades arregladas deben terner la misma longitud");
}



int totalSales = 0;

for (int i=0 ; i < PRICES.length;i++){
totalSales +=PRICES[i]*CANTIDADES[i];
    
}

        if (totalSales > VENTAS_ESCALON) {
            System.out.println("Buenas ventas");
        } else {
            System.out.println("bajas ventas");
        }
    }

}
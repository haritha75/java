import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatEx {
    public static void main(String[] args) {
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(); //it return default currency.
        int amount =2000;
        System.out.println(nf.format(amount));

        System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(amount));  //if you want different countries currency use like this.
        System.out.println();

        NumberFormat j= NumberFormat.getCurrencyInstance(new Locale("en","IN")); //here,we are mentioning indian currency.

       int amount1 = 10000;
       String res = j.format(amount1);
        System.out.println(res);

       j.setCurrency(Currency.getInstance(Locale.JAPAN)); //if you want change currency then use setCurrency method.
       res = j.format(amount1);
        System.out.println(res);


        for(var x : Locale.getAvailableLocales()) //it returns locales.
            System.out.println(x);

        for(var x1 : Currency.getAvailableCurrencies()) //it returns currencies.
            System.out.println(x1);

    }
}
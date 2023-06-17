public record Person2(String name,int age) {

    public Person2 { //it is a constructor it returns whatever you mention in the record keyword.if you have different output then use parameterized constructor.in parameterized constructor you mention whatever you want.
        if(age<0)
            throw  new IllegalArgumentException("age is not valid"); //here it returns age and name.if not mentioning this constructor it default have the constructor.
    }
}

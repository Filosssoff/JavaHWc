public class HWFive {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Arthas Menethil", "Crown prince of Lordaeron", "amlich@lomail.lo","545112", 50000, 24);
        persArray[1] = new Employee("Kil'Jaeden the Deciever", "Supreme Commander of the Burning Legion", "kj@bl.un", "6004002", 5000000, 33000);
        persArray[2] = new Employee("Sheogoath", "Daedric lord", "shsh@shis.ni", "05194865190245017465765", 0, Integer.MAX_VALUE);
        persArray[3] = new Employee("Robert House", "Ruler of New Vegas", "roberthouse@nvmail.nv", "00000001", 3500000, 261);
        persArray[4] = new Employee("Jack Ryan", "Ace in the Hole", "jj@gmail.com", "17233544", 5000, 4);

        //Формально, вроде бы, всё есть...

        for (int indPArr = 0; indPArr < persArray.length; indPArr++) {
            if (persArray[indPArr].getAge() > 40) {
                persArray[indPArr].infoFull();
            }
        }
    }
}

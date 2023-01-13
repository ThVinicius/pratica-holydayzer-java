public class Calendar {
    Holyday[] holydays = new Holyday[11];

    public Calendar() {
        this.holydays[0] = new Holyday("Confraternização mundial", "01/01/2023");
        this.holydays[1] = new Holyday("Carnaval", "21/02/2023");
        this.holydays[2] = new Holyday("Páscoa", "17/04/2023");
        this.holydays[3] = new Holyday("Tiradentes", "21/04/2023");
        this.holydays[4] = new Holyday("Dia do trabalho", "01/05/2023");
        this.holydays[5] = new Holyday("Corpus Christi", "08/06/2023");
        this.holydays[6] = new Holyday("Independência do Brasil", "07/09/2023");
        this.holydays[7] = new Holyday("Nossa Senhora Aparecida", "12/10/2023");
        this.holydays[8] = new Holyday("Finados", "02/11/2023");
        this.holydays[9] = new Holyday("Proclamação da República", "15/11/2023");
        this.holydays[10] = new Holyday("Natal", "25/12/2023");
    }

    public void printHolidayList() {
        for (Holyday holyday : this.holydays) {
            System.out.println(holyday.getDate() + " - " + holyday.getName());
        }
    }

    public void printHolidayName(String date) {

        for (Holyday holyday : this.holydays) {
            if (holyday.getDate().equals(date)) {

                System.out.println(holyday.getName());
                return;
            }
        }

        System.out.println("Essa data não é um feriado!");

    }

}

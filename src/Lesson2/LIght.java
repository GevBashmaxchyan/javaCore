package Lesson2;

class LIght {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //motavor luysi aragutyuny mili varkyanum
        lightspeed = 186000;

        //nshel oreri qanaky
        days = 1000;

        seconds = days * 24 * 60 * 60;
        // darcnel varkyan

        distance = lightspeed * seconds ;

        // hashvel heravorutyuny
        System.out.print(" luysy kancni " + days);
        System.out.print(" orum  motavor ");
        System.out.println(distance + " mil");
    }


}

public class Svetofor {
    int counter;
    public String color = "";

    public String change_color() {
        counter += 1;
        if (counter == 1 ) {
            color = "green";
        }else if (counter == 2) {
            color = "yellow";
        } else if (counter == 3) color = "red";
        if (counter == 3) {
            counter = 0;
        }
        return color;
    }

    public void svetofor(String s) {
        switch (color) {
            case ("green"):
                System.out.println("можно ехать");
                break;
            case ("yellow"):
                System.out.println("подожди");
            case ("red"):
                System.out.println("стоять");
                break;
        }

    }
}

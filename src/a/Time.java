package a;

public class Time {
    // Atributos privados de la clase Time
    private int hour;
    private int minute;
    private int second;

    // Tiempo determinado por las horas minutos y segundos especificados en la impresion
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters y setters de los atributos
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    // Setter del tiempo incluyendo sus tres atributos
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Calculo del siguiente segundo
    public Time nextSecond (){
        second++; //Aumento de los segundos
        if (second == 60) {
            second = 0; // Si el segundo llega a 60, pasa a 0
            minute++; // Los minutos aumentan
            if (minute==60) {
                minute = 0; // Cuando los mintuos llegan a 60, pasan a 0
                hour++; // Las horas aumentan
                if (hour==24) {
                    hour = 0; // Si la hora es 24, entonces se muestra 0
                }
            }
        }
        return this; // Se retorna toda la estructura del if
    }

    // Calculo del segundo anterior
    public Time previousSecond (){
        second--; // Los segundos siempre disminuyen
        if (second == -1) {
            second = 59; // Si el segundo es -1, se muestra 59
            minute--; // Los minutos disminuyen
            if (minute == -1) {
                minute = 59; // Si el minuto es -1, pasa a ser 59
                hour--; // Las horas disminuyen
                if (hour == -1) {
                    hour = 23; // Si la hora es -1, pasa a ser 23
                }
            }
        }
        return this; // Se retorna toda la estructura del if
    }
}
package com.examples.Collection;

public enum Days {
    SUNDAY(false),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false);

    private final boolean isWeekday;

    Days(Boolean type){
        isWeekday = type;
    }

    public boolean getDayType(){
        return isWeekday;
    }
    public String getType(){
        return isWeekday? "weekday":"weekend";
    }
}

class DaysExample {
    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.printf("%s : %s\n",day,day.getType());
        }
    }
}

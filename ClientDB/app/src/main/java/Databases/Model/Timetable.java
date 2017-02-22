package Databases.Model;

import java.sql.Time;

/**
 * Created by guitarman on 22/2/17.
 */

public class Timetable {
    //int Fid;
    String subCode,subTitle,day;
    Time start,end;

    public Timetable( String subCode, String subTitle, String day, Time start,Time end) {
        this.start=start;
        this.end=end;
        this.subCode=subCode;
        this.subTitle=subTitle;
        this.day=day;
    }

    //Setter

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public void setEnd(Time end) {
        this.end = end;
    }


    // getter


    public String getSubCode() {
        return subCode;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getDay() {
        return day;
    }

    public Time getStart() {
        return start;
    }

    public Time getEnd() {
        return end;
    }
}

package Databases.Model;
import java.sql.Time;
import java.util.Date;
/**
 * Created by guitarman on 22/2/17.
 */

public class SubjectAttendenceInfo {
    int Fid,SIID,flag_ID;
     Date sDate,devDate;
     Time sTime,devTime;
    //String subCode,subTitle,subType,divID,facultySubMapID,branch;
    boolean sync;

    public SubjectAttendenceInfo(int Fid,int SIID,int flag_ID,Date sDate,Date devDate,Time sTime,Time devTime ) {
        this.Fid = Fid;
        this.SIID=SIID;
        this.flag_ID=flag_ID;
        this.sDate=sDate;
        this.devDate=devDate;
        this.sTime=sTime;
        this.devTime=devTime;
    }

    //Setter

    public void setFid(int fid) {
        Fid = fid;
    }

    public void setSIID(int SIID) {
        this.SIID = SIID;
    }

    public void setFlag_ID(int flag_ID) {
        this.flag_ID = flag_ID;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    public void setDevDate(Date devDate) {
        this.devDate = devDate;
    }

    public void setsTime(Time sTime) {
        this.sTime = sTime;
    }

    public void setDevTime(Time devTime) {
        this.devTime = devTime;
    }

    public void setSync(boolean sync) {
        this.sync = sync;
    }


    // getter


    public int getFid() {
        return Fid;
    }

    public int getSIID() {
        return SIID;
    }

    public int getFlag_ID() {
        return flag_ID;
    }

    public Date getsDate() {
        return sDate;
    }

    public Date getDevDate() {
        return devDate;
    }

    public Time getsTime() {
        return sTime;
    }

    public Time getDevTime() {
        return devTime;
    }

    public boolean isSync() {
        return sync;
    }
}

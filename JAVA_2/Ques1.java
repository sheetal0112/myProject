import java.util.Calendar;
import java.util.Date;

abstract class LibraryHome {

    protected String lib_name;
    protected String lib_address;
    //protected final long lib_seatcap;

    public LibraryHome() {
        lib_name="India Library";
        lib_address="Noida Sector 127";
        //lib_seatcap=5000;
    }
    abstract void getLibraryInfo();
}

interface LibraryUtilities {

    long lib_seatcap=5000;
    void issueBook();
    void returnBook();

}


public class Quest1 extends LibraryHome implements LibraryUtilities {

    private String reader_name;
    private String reader_mobile;
    private String book_name;
    private Date issue_date;
    private Date return_date;

    public Ques1(String rn, String rm,String bn) {
        reader_name=rn;
        reader_mobile=rm;
        book_name=bn;
    }

    @Override
    public void getLibraryInfo() {
        System.out.println("--------Library Details----------");
        System.out.println("Library Name: "+lib_name);
        System.out.println("Library Address: "+lib_address);
        System.out.println("Library Seating Capacity: "+lib_seatcap);
    }

    @Override
    public void issueBook() {
        Date curr_date=new Date();
        issue_date=curr_date;
        Calendar C=Calendar.getInstance();
        C.add(Calendar.DATE,7);
        return_date=C.getTime();
        System.out.println("Success! Book issued to "+reader_name+" on "+curr_date.toString()+" return date is on "+return_date);
    }

    @Override
    public void returnBook() {
        if(issue_date==null || return_date==null) {
            System.out.println("\nNo book has been issued!");
        } else {
            issue_date=null;
            return_date=null;
            System.out.println("Book has been returned successfully!");
        }
    }

    public void getMemberDetails() {
        if(issue_date==null || return_date==null) {
            System.out.println("Reader Name: " + reader_name);
            System.out.println("Reader Mobile: " + reader_mobile);
            System.out.println("Book Name: " + book_name);
            System.out.println("\nNo Book Has Been Issued!");
        } else {
            System.out.println("Reader Name: " + reader_name);
            System.out.println("Reader Mobile: " + reader_mobile);
            System.out.println("Book Name: " + book_name);
            System.out.println("Book Issue Date: " + issue_date);
            System.out.println("Book Return Date: " + return_date);
        }
    }
}
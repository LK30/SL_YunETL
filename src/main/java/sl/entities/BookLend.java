package sl.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection = "test")
public class BookLend {
    @Id
    long id;
    @Field("account")
    String account;
    @Field("operation_time")
    String operation_time;
    @Field("year")
    int year;
    @Field("month")
    int month;
    @Field("day")
    int day;
    @Field("hour")
    int hour;
    @Field("operation")
    String operation;
    @Field("book_name")
    String book_name;
    @Field("book_no")
    String book_no;
    @Field("book_category")
    String book_category;
    @Field("book_macrc_no")
    String book_macrc_no;
    @Field("book_author")
    String book_author;
    @Field("book_publisher")
    String book_publisher;
    @Field("book_pubyear")
    String book_pubyear;
    @Field("render_name")
    String render_name;
    @Field("render_school")
    String render_school;
    @Field("render_academy")
    String render_academy;
    @Field("render_major")
    String render_major;
    @Field("render_grade")
    String render_grade;
    @Field("render_identity")
    String render_identity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getOperation_time() {
        return operation_time;
    }

    public void setOperation_time(String operation_time) {
        this.operation_time = operation_time;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_no() {
        return book_no;
    }

    public void setBook_no(String book_no) {
        this.book_no = book_no;
    }

    public String getBook_category() {
        return book_category;
    }

    public void setBook_category(String book_category) {
        this.book_category = book_category;
    }

    public String getBook_macrc_no() {
        return book_macrc_no;
    }

    public void setBook_macrc_no(String book_macrc_no) {
        this.book_macrc_no = book_macrc_no;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_publisher() {
        return book_publisher;
    }

    public void setBook_publisher(String book_publisher) {
        this.book_publisher = book_publisher;
    }

    public String getBook_pubyear() {
        return book_pubyear;
    }

    public void setBook_pubyear(String book_pubyear) {
        this.book_pubyear = book_pubyear;
    }

    public String getRender_name() {
        return render_name;
    }

    public void setRender_name(String render_name) {
        this.render_name = render_name;
    }

    public String getRender_school() {
        return render_school;
    }

    public void setRender_school(String render_school) {
        this.render_school = render_school;
    }

    public String getRender_academy() {
        return render_academy;
    }

    public void setRender_academy(String render_academy) {
        this.render_academy = render_academy;
    }

    public String getRender_major() {
        return render_major;
    }

    public void setRender_major(String render_major) {
        this.render_major = render_major;
    }

    public String getRender_grade() {
        return render_grade;
    }

    public void setRender_grade(String render_grade) {
        this.render_grade = render_grade;
    }

    public String getRender_identity() {
        return render_identity;
    }

    public void setRender_identity(String render_identity) {
        this.render_identity = render_identity;
    }
}

package app.ieee.ma.emsi.navdrawtest.classes;

/**
 * Created by idriss on 01/11/2015.
 */
public class Person {

    private String _title;
    private String _Date;
    private int _imageUrl;

    public  Person(String title , String date , int url)
    {
        this._title = title;
        this._Date = date;
        this._imageUrl = url;
    }

    public String get_Date() {
        return _Date;
    }

    public int get_imageUrl() {
        return _imageUrl;
    }

    public String get_title() {
        return _title;
    }


    public void set_title(String _title) {
        this._title = _title;
    }

    public void set_Date(String _Date) {
        this._Date = _Date;
    }

    public void set_imageUrl(int _imageUrl) {
        this._imageUrl = _imageUrl;
    }
}

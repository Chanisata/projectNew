package controllers;

import models.foot;
import play.api.templates.Html;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result main(Html content) {
        return ok(main.render(content));
    }
    public static Result index(){
        return main(home_page.render());
    }
    public static Result Pro(){
        return main(Products .render());
    }
    public static Result Promo(){return main(Promotions.render());}

    public static Result showfoot() {
        String myname;
        foot foot1;
       foot1=new foot();
        foot1.setId("111");
       foot1.setName("ปูทะเล");
       foot1.setprice(300);
        foot foot2=new foot("112","หอยนางรม",170);
        foot foot3=new foot("113","ทะเลรวม (ชุดเล็ก)",450);
        foot foot4=new foot("114","ปูพร้อมกิน",150);
        foot foot5=new foot("115","หอยแครง",150);
        foot foot6=new foot("116","ทะเลรวม (ชุดใหญ่)",750);

                return main(showfoot.render(foot1,foot2,foot3,foot4,foot5,foot6));
    }


public static Result inputfoot() {
    return main(intputfoot.render());
}

}

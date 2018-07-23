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
        foot1.setId("com1");
       foot1.setName("ห้องปฏิบัติการคอมพิวเตอร์");
       foot1.setprice(50);

        foot foot2=new foot("com2","ห้องปฏิบัติการคอมพิวเตอร์2",80);

                return main(showfoot.render(foot1,foot2));
    }


public static Result inputfoot() {
    return main(intputfoot.render());
}

}

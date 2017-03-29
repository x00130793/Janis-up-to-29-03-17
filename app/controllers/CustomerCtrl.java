package controllers;

import models.users.*;
import models.*;
import play.data.*;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.*;
import views.html.customer.*;
import views.html.customer.profileFiles.*;
import controllers.security.*;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
// Import models
// Import security controllers

@Security.Authenticated(Secured.class)
@With(CheckIfCustomer.class)
public class CustomerCtrl extends Controller {

    List<Category> categoriesList = Category.findAll();

    public Result profile(Long cat, String filter) {
        return ok(profile.render(getCurrentUser(), User.getUserById(session().get("email")), categoriesList, cat, filter));
    }
    public Result profileEdit(Long cat, String filter) {
        return ok(profileEdit.render(getCurrentUser(), User.getUserById(session().get("email")), categoriesList, cat, filter));
    }

    // Get a user - if logged in email will be set in the session
    private Customer getCurrentUser() {
        return (Customer)User.getUserById(session().get("email"));
    }





    //Copied from shoppingCtrl v


//    public Result placeOrder(Long cat, String filters){
//        Customer c = getCurrentUser();
//
//        // Create an order instance
//        ShopOrder order = new ShopOrder();
//
//        // Associate order with customer
//        order.setCustomer(c);
//
//        // copy the basket to order
//       order.setItems(c.getBasket().getBasketItems());
//
//      // Save the order now to generate a new id for this order
//        order.save();
//
//        // Move items from basket to order
//        for(OrderItem i: order.getItems()){
//            // Associate with order
//            i.setOrder(order);
//
//            // Remove from basket
//            i.setBasket(null);
//
//            // update item
//            i.update();
//
//        }
//
//        // Update the order
//        order.update();
//
//        // Clear and update the shopping basket
//        c.getBasket().setBasketItems(null);
//        c.getBasket().update();
//
//        // Show order confirmed view Order
//        return ok(orderConfirmed.render(c, User.getUserById(session().get("email")), categoriesList, order, cat, filters));
//    }



}

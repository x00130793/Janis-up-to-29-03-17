
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Form[models.users.Login],Form[models.users.User],models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], addUserForm: Form[models.users.User], user: models.users.User,  categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.167*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user, categories, catId, filter)/*5.48*/ {_display_(Seq[Any](format.raw/*5.50*/("""

	"""),format.raw/*7.2*/("""<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Login to your account</h2>
						"""),_display_(/*13.8*/if(loginForm.hasGlobalErrors)/*13.37*/ {_display_(Seq[Any](format.raw/*13.39*/("""
            						"""),format.raw/*14.19*/("""<p class="alert alert-warning">
            					"""),_display_(/*15.19*/loginForm/*15.28*/.globalError.message),format.raw/*15.48*/("""
           				"""),format.raw/*16.16*/("""</p>
						""")))}),format.raw/*17.8*/("""
						"""),_display_(/*18.8*/if(flash.containsKey("error"))/*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/("""
						    """),format.raw/*19.11*/("""<div class="alert alert-warning">
						    """),_display_(/*20.12*/flash/*20.17*/.get("loginRequired")),format.raw/*20.38*/("""
						    """),format.raw/*21.11*/("""</div>
						""")))}),format.raw/*22.8*/("""
						

							"""),format.raw/*25.8*/("""<!-- The login form -->
							"""),_display_(/*26.9*/helper/*26.15*/.form(action = controllers.routes.LoginController.loginSubmit(catId, filter))/*26.92*/ {_display_(Seq[Any](format.raw/*26.94*/("""

								"""),format.raw/*28.9*/("""<div class="form-group">
								"""),_display_(/*29.10*/inputText(loginForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*29.113*/("""
								"""),format.raw/*30.9*/("""</div>
								<div class="form-group">
								"""),_display_(/*32.10*/inputPassword(loginForm("password"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*32.123*/("""
								"""),format.raw/*33.9*/("""</div>
							"""),format.raw/*34.18*/("""
								"""),format.raw/*35.54*/("""
								"""),format.raw/*36.30*/("""
							"""),format.raw/*37.19*/("""
							"""),format.raw/*38.88*/("""
							"""),format.raw/*39.8*/("""<div class="form-group"> <input type="submit" value="Sign In" class="btn btn-primary"> </div>
						""")))}),format.raw/*40.8*/("""
					
					"""),format.raw/*42.6*/("""</div><!--/login form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>New User? Signup!</h2>

						"""),_display_(/*51.8*/if(flash.containsKey("success"))/*51.40*/{_display_(Seq[Any](format.raw/*51.41*/("""
							"""),format.raw/*52.8*/("""<div class="alert alert-success">
							"""),_display_(/*53.9*/flash/*53.14*/.get("success")),format.raw/*53.29*/("""
							"""),format.raw/*54.8*/("""</div>
						""")))}),format.raw/*55.8*/("""
						"""),_display_(/*56.8*/if(flash.containsKey("fail"))/*56.37*/{_display_(Seq[Any](format.raw/*56.38*/("""
							"""),format.raw/*57.8*/("""<div class="alert alert-danger">
							"""),_display_(/*58.9*/flash/*58.14*/.get("fail")),format.raw/*58.26*/("""
							"""),format.raw/*59.8*/("""</div>
						""")))}),format.raw/*60.8*/("""
					"""),format.raw/*61.6*/("""</div>
					"""),_display_(/*62.7*/form(action = routes.HomeController.addUserSubmit(catId, filter), 'class -> "form-horizontal", 'role->"form")/*62.116*/ {_display_(Seq[Any](format.raw/*62.118*/("""

						"""),format.raw/*64.7*/("""<div class="form-row">
							<label>
							"""),_display_(/*66.9*/inputText(addUserForm("fName"), '_label -> "Fisrt Name",'class -> "form-control ")),format.raw/*66.91*/("""
							"""),format.raw/*67.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*72.9*/inputText(addUserForm("lName"), '_label -> "Second Name",'class -> "form-control")),format.raw/*72.91*/("""
							"""),format.raw/*73.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*78.9*/inputText(addUserForm("email"), '_label -> "E-mail",'class -> "form-control")),format.raw/*78.86*/("""
							"""),format.raw/*79.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*84.9*/inputText(addUserForm("password"), '_label -> "Password",'class -> "form-control", 'type -> "password")),format.raw/*84.112*/("""
							"""),format.raw/*85.8*/("""</label>
						</div>


						<div class="actions">
							<input type="submit" value="Save" class="btn btn-primary">
							<a href=""""),_display_(/*91.18*/routes/*91.24*/.LoginController.login(catId, filter)),format.raw/*91.61*/("""">
							</a>
						</div>


					</div>
					</div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section><!--/form-->

""")))}),format.raw/*103.2*/("""
""")))}),format.raw/*104.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],addUserForm:Form[models.users.User],user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,addUserForm,user,categories,catId,filter)

  def f:((Form[models.users.Login],Form[models.users.User],models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,addUserForm,user,categories,catId,filter) => apply(loginForm,addUserForm,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Mar 29 18:07:36 IST 2017
                  SOURCE: /home/wdd/webapps/OnlineShopProject/app/views/login.scala.html
                  HASH: 770639cfe39cb366c3a90fbd4b2e1907f21c1ef6
                  MATRIX: 839->1|1115->166|1142->184|1170->257|1197->259|1251->305|1290->307|1319->310|1557->522|1595->551|1635->553|1682->572|1759->622|1777->631|1818->651|1862->667|1904->679|1938->687|1977->717|2017->719|2056->730|2128->775|2142->780|2184->801|2223->812|2267->826|2310->842|2368->874|2383->880|2469->957|2509->959|2546->969|2607->1003|2732->1106|2768->1115|2844->1164|2979->1277|3015->1286|3057->1310|3094->1364|3131->1394|3167->1413|3203->1501|3238->1509|3369->1610|3408->1622|3654->1842|3695->1874|3734->1875|3769->1883|3837->1925|3851->1930|3887->1945|3922->1953|3966->1967|4000->1975|4038->2004|4077->2005|4112->2013|4179->2054|4193->2059|4226->2071|4261->2079|4305->2093|4338->2099|4377->2112|4496->2221|4537->2223|4572->2231|4644->2277|4747->2359|4782->2367|4883->2442|4986->2524|5021->2532|5122->2607|5220->2684|5255->2692|5356->2767|5481->2870|5516->2878|5678->3013|5693->3019|5751->3056|5912->3186|5945->3188
                  LINES: 27->1|32->1|33->3|34->4|35->5|35->5|35->5|37->7|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|48->18|48->18|48->18|49->19|50->20|50->20|50->20|51->21|52->22|55->25|56->26|56->26|56->26|56->26|58->28|59->29|59->29|60->30|62->32|62->32|63->33|64->34|65->35|66->36|67->37|68->38|69->39|70->40|72->42|81->51|81->51|81->51|82->52|83->53|83->53|83->53|84->54|85->55|86->56|86->56|86->56|87->57|88->58|88->58|88->58|89->59|90->60|91->61|92->62|92->62|92->62|94->64|96->66|96->66|97->67|102->72|102->72|103->73|108->78|108->78|109->79|114->84|114->84|115->85|121->91|121->91|121->91|133->103|134->104
                  -- GENERATED --
              */
          
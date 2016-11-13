
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mintpreview_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class mintpreview extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("MINT art")/*1.18*/ {_display_(Seq[Any](format.raw/*1.20*/("""

    """),format.raw/*3.5*/("""<style>
        .footer"""),format.raw/*4.16*/("""{"""),format.raw/*4.17*/("""
            """),format.raw/*5.13*/("""display: none !important ;
        """),format.raw/*6.9*/("""}"""),format.raw/*6.10*/("""
    """),format.raw/*7.5*/("""</style>


    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("javascripts/onepage/jquery.fullpage.js")),format.raw/*10.84*/("""" type="text/javascript"></script>

    <script>
        $(function()"""),format.raw/*13.21*/("""{"""),format.raw/*13.22*/("""
            """),format.raw/*14.13*/("""$('#fullpage').fullpage("""),format.raw/*14.37*/("""{"""),format.raw/*14.38*/("""
                """),format.raw/*15.17*/("""anchors: ['first', 'second', 'third', 'fourth'],
//                menu: '#menu'
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/(""");

        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/(""");
    </script>

    <div class="top-bar bg-black border-bottom border-white border-1 txt-white">
        <nav id="mint-menu">
            <a href="">HOME</a>
            <a href="">EVENTS</a>
        </nav>
    </div>

    """),format.raw/*29.37*/("""
        """),format.raw/*30.27*/("""
            """),format.raw/*31.142*/("""
            """),format.raw/*32.138*/("""
            """),format.raw/*33.130*/("""
            """),format.raw/*34.129*/("""
        """),format.raw/*35.18*/("""
    """),format.raw/*36.15*/("""

    """),format.raw/*38.60*/("""

    """),format.raw/*40.5*/("""<div>

        <div id="home" class="section bg-black txt-white">
            <img id="header-image-homepage" class="minw-350" src=""""),_display_(/*43.68*/routes/*43.74*/.Assets.versioned("images/header_collage.jpg")),format.raw/*43.120*/("""" alt="">
            <div class="content centered-translate">
                <iframe src="https://www.facebook.com/plugins/post.php?href=https%3A%2F%2Fwww.facebook.com%2Fmintcreativity%2Fposts%2F1591789477793686%3A0&width=500" width="500" height="644" style="background-color: white;display: block; margin: 0 auto;border:none;overflow:hidden; float: left; margin-top:50px;" scrolling="no" frameborder="0" allowTransparency="true"></iframe>
                <div class="mt50 fr pl-20" style="width: 650px;">
                    MINT is a creative organization that promotes and gives exposure to growing artists.
                    <br>
                    <br>
                    We are looking for talented artists that would like to present art, including:
                    <ul>
                        <li>Performance</li>
                        <li>Theater</li>
                        <li>Video</li>
                        <li>Paintings</li>
                        <li>Sculptures</li>
                        <li>Installation art</li>
                    </ul>
                    <p>
                        If you're interested in working with MINT, don't hesitate contact us at <a href="mailto:info@mintart.nl?Subject=MINT: Info">info@mintart.nl</a>, we'll get you in the spotlight, where you belong!
                    </p>
                </div>
            </div>

        </div>
        <div id="artists" class="section bg-white txt-black">
            """),format.raw/*67.63*/("""
                """),format.raw/*68.28*/("""
            """),format.raw/*69.23*/("""
            """),format.raw/*70.36*/("""
                """),format.raw/*71.26*/("""
                    """),format.raw/*72.32*/("""
                """),format.raw/*73.27*/("""
                """),format.raw/*74.26*/("""
                    """),format.raw/*75.32*/("""
                """),format.raw/*76.27*/("""
                """),format.raw/*77.26*/("""
                    """),format.raw/*78.32*/("""
                """),format.raw/*79.27*/("""
                """),format.raw/*80.26*/("""
                    """),format.raw/*81.32*/("""
                """),format.raw/*82.27*/("""
                """),format.raw/*83.26*/("""
                    """),format.raw/*84.32*/("""
                """),format.raw/*85.27*/("""
            """),format.raw/*86.23*/("""
        """),format.raw/*87.9*/("""</div>
        <div id="events" class="section bg-black txt-white">
            """),format.raw/*89.63*/("""
                """),format.raw/*90.27*/("""
            """),format.raw/*91.23*/("""
        """),format.raw/*92.9*/("""</div>
        <div id="about" class="section bg-white txt-black">
            """),format.raw/*94.63*/("""
                """),format.raw/*95.31*/("""
            """),format.raw/*96.23*/("""
        """),format.raw/*97.9*/("""</div>

        <div class="xflex">

        </div>

    </div>
""")))}),format.raw/*104.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object mintpreview extends mintpreview_Scope0.mintpreview
              /*
                  -- GENERATED --
                  DATE: Sun Nov 13 18:53:36 CET 2016
                  SOURCE: C:/Users/Mo Lester/Desktop/mintart/app/views/mintpreview.scala.html
                  HASH: ff93cf37d98920f3dd79f520608025a20e15c816
                  MATRIX: 621->1|645->17|684->19|716->25|766->48|794->49|834->62|895->97|923->98|954->103|1010->132|1025->138|1105->197|1202->266|1231->267|1272->280|1324->304|1353->305|1398->322|1519->415|1548->416|1587->428|1616->429|1869->686|1906->713|1948->855|1990->993|2032->1123|2074->1252|2111->1270|2144->1285|2178->1346|2211->1352|2371->1485|2386->1491|2454->1537|3957->3064|4002->3092|4043->3115|4084->3151|4129->3177|4178->3209|4223->3236|4268->3262|4317->3294|4362->3321|4407->3347|4456->3379|4501->3406|4546->3432|4595->3464|4640->3491|4685->3517|4734->3549|4779->3576|4820->3599|4856->3608|4964->3738|5009->3765|5050->3788|5086->3797|5193->3926|5238->3957|5279->3980|5315->3989|5411->4054
                  LINES: 25->1|25->1|25->1|27->3|28->4|28->4|29->5|30->6|30->6|31->7|34->10|34->10|34->10|37->13|37->13|38->14|38->14|38->14|39->15|41->17|41->17|43->19|43->19|53->29|54->30|55->31|56->32|57->33|58->34|59->35|60->36|62->38|64->40|67->43|67->43|67->43|91->67|92->68|93->69|94->70|95->71|96->72|97->73|98->74|99->75|100->76|101->77|102->78|103->79|104->80|105->81|106->82|107->83|108->84|109->85|110->86|111->87|113->89|114->90|115->91|116->92|118->94|119->95|120->96|121->97|128->104
                  -- GENERATED --
              */
          
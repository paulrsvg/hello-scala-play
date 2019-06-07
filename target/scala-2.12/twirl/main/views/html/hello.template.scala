
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hello")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
    """),format.raw/*2.5*/("""<section id="content">
        <div class= "wrapper doc">
            <article>
                <h1>Hello World</h1>
            </article>
            <aside>
                """),_display_(/*8.18*/commonSidebar()),format.raw/*8.33*/("""
            """),format.raw/*9.13*/("""</aside>

        </div>

    </section>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jun 07 11:03:57 MDT 2019
                  SOURCE: /Users/paul.russavage/projects/play-samples-play-scala-hello-world-tutorial/app/views/hello.scala.html
                  HASH: 535c6f7c199edc64402dfb4c5e3f118a8d5445ed
                  MATRIX: 811->1|832->14|871->16|902->21|1105->198|1140->213|1180->226
                  LINES: 26->1|26->1|26->1|27->2|33->8|33->8|34->9
                  -- GENERATED --
              */
          
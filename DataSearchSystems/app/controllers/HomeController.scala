package controllers

import javax.inject._
import play.api.mvc._
import models._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.io.Source
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) with play.api.i18n.I18nSupport {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def demo() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.demo(NLPForm.form))
  }
  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }
  
  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }
  def dashboard() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.dashboarddemo())
  }
  def cssmap() = Action { implicit request: Request[AnyContent] =>
    var resultList: List[List[String]] = List()
    val a = List("1","2","3");
    resultList=resultList:+a
    val b = List("4","5","6");
    resultList = resultList:+b
    Ok(views.html.cssmap(resultList))
  }

  def datasearch() = Action { implicit request: Request[AnyContent] =>

    Ok(views.html.dataSearch(BasicForm.form))
  }
  def downloadCsv() = Action { implicit request: Request[AnyContent] =>
    val bufferedSource = Source.fromFile("D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/controllers/pred.csv")

    var resultList: List[List[String]] = List()

    for (line <- bufferedSource.getLines.take(51)) {
      val cols = line.split(",")
      resultList = resultList :+ cols.toList

    }
    resultList = resultList.tail
    Ok(views.html.downloadCsv(resultList))

  }

  def downloadResult =Action{ implicit request: Request[AnyContent] =>
    Ok.sendFile(new java.io.File(
      "D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/controllers/pred.csv"))
  }
  def nlpSearch() = Action{ implicit request: Request[AnyContent] =>
    println("!!!!!!!");
    Ok(views.html.dataSearchNLP(NLPForm.form));
  }

  def simpleFormPost() = Action { implicit request: Request[AnyContent] =>
    val formData: NLPForm = NLPForm.form.bindFromRequest.get // Careful: BasicForm.form.bindFromRequest returns an Option
    //Ok(views.html.result(formData.month, formData.day, formData.year, formData.street, formData.ty)) // just returning the data because it's an example :
    //var resultList = getSearchResult(formData);
    println(formData.description);
    val res = getSearchResult(formData)
    println(res)
    Ok(views.html.dataSearchNLPResult(res))
  }
  def simpleFormPost2() = Action { implicit request: Request[AnyContent] =>
    val formData: BasicForm = BasicForm.form.bindFromRequest.get // Careful: BasicForm.form.bindFromRequest returns an Option
    //Ok(views.html.result(formData.month, formData.day, formData.year, formData.street, formData.ty)) // just returning the data because it's an example :
    //var resultList = getSearchResult(formData);
    println(formData.year.toString + "   "+ formData.crimeType.toUpperCase);
    val res = getLocationSearchResult(formData)
    for(args<-res) println(args)
    var resultList: List[List[String]] = List()


    val a = List("1","2","3");
    resultList=resultList:+a
    val b = List("4","5","6");
    resultList = getLocationSearchResult(formData)

    Ok(views.html.cssmap(resultList))
  }

  def map() = Action { implicit request: Request[AnyContent] =>
    var resultList: List[List[String]] = List()
    val a = List("1","2","3");
    resultList=resultList:+a
    val b = List("4","5","6");
    resultList = resultList:+b
    Ok(views.html.map(resultList))
  }

  def getLocationSearchResult(formdata : BasicForm):List[List[String]] ={
    var bufferedSource = Source.fromFile("D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/controllers/data.csv")
    // var bufferedSource = Source.fromFile("/Users/saigou/Downloads/data.csv")

    var resultList: List[List[String]] = List()
    for (line <- bufferedSource.getLines()) {

      var cols: Array[String] = line.split(",");
      if(cols(3).contains(formdata.crimeType)&&cols(13).contains(formdata.street)
      &&cols(8).equals(formdata.month.toString())&&cols(9).equals(formdata.year.toString())){
        resultList = resultList :+ cols.toList
      }
    }
    return resultList;
  }

  def getSearchResult(formdata : NLPForm): String ={
    var bufferedSource = Source.fromFile("D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/controllers/nlp_cleaned_result.csv")
    // var bufferedSource = Source.fromFile("/Users/saigou/Downloads/data.csv")

    var pattern = formdata.description.toUpperCase
    var res = new String
    for (line <- bufferedSource.getLines()) {

      var cols: Array[String] = line.split(",");
      //println("!!!!    " + cols(0));
      if (cols(0).equals(pattern)) {
         res = cols(0)
        println("in this")
      }
    }
    return res;
  }
}

/*
* Given a time in -hour AM/PM format, convert it to military (24-hour) time.
*/
class TimeConversion{

  public static String convertTime(String s) {
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat requiredDf = new SimpleDateFormat("HH:mm:ss");
        String requiredDateFormatStr="";
        try{
            Date d = df.parse(s);
            requiredDateFormatStr = requiredDf.format(d);   
        } catch (ParseException e){
            e.printStackTrace();
        }
        return requiredDateFormatStr;
    }
  
}

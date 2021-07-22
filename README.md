# JASPER REPORTS WITH SPRING BOOT
A demo for using jasper within a Spring Boot App I made for a Jasper session.

This depicts integration of jasper reports within a spring boot app .

To run do `mvn spring-boot:run`

Mostly uses concept of JasperReportsViewResolver as defined here http://stackoverflow.com/questions/27532446/how-to-use-jasperreports-with-spring-mvc 
[Check the answer with the tick there :smiley:]

# Update
As per Spring 5 https://github.com/spring-projects/spring-framework/issues/17884 JasperReportsViewResolver has been deprecated 
hence updating code to use jasper directly .Will add an example soon .


`The jasper endpoints shall be like http://localhost:8080/reports/{reportname}?format={format}&id={id} (id param are optional,you can add ur custom report params there)`

eg.
`http://localhost:8080/reports/rpt_A?format=pdf`


Cheers! :wine_glass:

_Gaurav_

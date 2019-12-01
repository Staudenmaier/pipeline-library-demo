#!/usr/bin/env groovy
def call(String name = 'human') {
  echo "Hello, ${name}."


  
  def url = new URL('http://google.de')
  def connection = url.openConnection()
  connection.requestMethod = 'GET'
  if (connection.responseCode == 200) {
    println connection.content.text
    println connection.contentType
    println connection.lastModified
    connection.headerFields.each { println "> ${it}"}
  }
}

def printParams(String name = 'human') {
  env.getEnvironment().each { name, value -> println "Name: $name -> Value $value" }
}

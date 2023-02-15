rm -rf .clover
rm -rf .cloverhistory
rm -rf target
rm -rf build
rm -rf build-tests
rm -rf clover

defects4j test

rm -rf target/classes
# javac evosuite-tests/org/apache/commons/csv/*.java 
ant with.clover test clover.report
# javac evosuite-tests/org/apache/commons/lang3/*.java 
# java org.junit.runner.JUnitCore org.apache.commons.lang3.time.DateUtils_ESTest
# mvn test
# $EVOSUITE -measureCoverage -class org.apache.commons.lang3.time.DateUtils -Djunit=org.apache.commons.lang3.time.DateUtils_ESTest -criterion branch -projectCP target/classes:target/test-classes:evosuite-tests

var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":103,"id":31787,"methods":[{"el":67,"sc":1,"sl":63},{"el":76,"sc":1,"sl":70},{"el":87,"sc":1,"sl":79}],"name":"TestNumbers","sl":14},{"el":26,"id":31787,"methods":[],"name":"TestNumbers.MyBeanHolder","sl":23},{"el":31,"id":31787,"methods":[],"name":"TestNumbers.MyBeanDefaultValue","sl":28},{"el":38,"id":31787,"methods":[{"el":36,"sc":9,"sl":36},{"el":37,"sc":9,"sl":37}],"name":"TestNumbers.MyBeanValue","sl":34},{"el":54,"id":31791,"methods":[{"el":53,"sc":9,"sl":48}],"name":"TestNumbers.MyBeanDeserializer","sl":46}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_300":{"methods":[{"sl":70}],"name":"testDoubleInf334","pass":true,"statements":[{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75}]},"test_362":{"methods":[{"sl":79}],"name":"testEmptyAsNumber540","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_506":{"methods":[{"sl":63}],"name":"testFloatNaN331","pass":true,"statements":[{"sl":64},{"sl":65},{"sl":66}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [506], [506], [506], [506], [], [], [], [300], [300], [300], [300], [300], [300], [], [], [], [362], [362], [362], [362], [362], [362], [362], [362], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

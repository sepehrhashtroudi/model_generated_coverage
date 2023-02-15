var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":9007,"methods":[{"el":23,"sc":5,"sl":20},{"el":30,"sc":5,"sl":25}],"name":"FailingDeserializer","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3":{"methods":[{"sl":20}],"name":"testLowerCaseTranslations","pass":true,"statements":[{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3], [3], [3], [], [], [], [], [], [], [], [], []]

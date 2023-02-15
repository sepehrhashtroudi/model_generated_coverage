var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":32196,"methods":[{"el":37,"sc":1,"sl":28}],"name":"TestFormatDetection","sl":7},{"el":19,"id":32196,"methods":[{"el":14,"sc":9,"sl":14},{"el":18,"sc":9,"sl":15}],"name":"TestFormatDetection.POJO","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_29":{"methods":[{"sl":28}],"name":"testInvalid443","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [29], [29], [29], [29], [29], [], [], [29], [], [], [], [], [], [], []]

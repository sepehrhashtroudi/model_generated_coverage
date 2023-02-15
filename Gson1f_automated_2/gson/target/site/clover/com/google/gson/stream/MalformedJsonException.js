var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":3901,"methods":[{"el":28,"sc":3,"sl":26}],"name":"MalformedJsonException","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_15":{"methods":[{"sl":26}],"name":"testStrictMultipleTopLevelValues18","pass":true,"statements":[{"sl":27}]},"test_28":{"methods":[{"sl":26}],"name":"testStrictComments20","pass":true,"statements":[{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [28, 15], [28, 15], [], []]

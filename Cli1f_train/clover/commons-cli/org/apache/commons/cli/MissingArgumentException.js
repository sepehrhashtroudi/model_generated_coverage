var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":108,"methods":[{"el":37,"sc":5,"sl":34}],"name":"MissingArgumentException","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_16":{"methods":[{"sl":34}],"name":"testMissingArg18","pass":true,"statements":[{"sl":36}]},"test_31":{"methods":[{"sl":34}],"name":"testMissingArg6","pass":true,"statements":[{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [16, 31], [], [16, 31], [], []]

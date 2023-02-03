var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":12994,"methods":[{"el":21,"sc":5,"sl":18},{"el":26,"sc":5,"sl":23},{"el":31,"sc":5,"sl":28}],"name":"JsonGenerationException","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_123":{"methods":[{"sl":23}],"name":"testInvalidArrayWrite118","pass":true,"statements":[{"sl":25}]},"test_93":{"methods":[{"sl":23}],"name":"testInvalidObjectWrite3","pass":true,"statements":[{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [123, 93], [], [123, 93], [], [], [], [], [], [], []]

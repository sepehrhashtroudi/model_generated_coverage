var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":91,"id":71120,"methods":[{"el":46,"sc":3,"sl":43},{"el":56,"sc":3,"sl":48},{"el":66,"sc":3,"sl":58},{"el":72,"sc":3,"sl":68},{"el":81,"sc":3,"sl":77},{"el":90,"sc":3,"sl":86}],"name":"TestErrorReporter","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_100":{"methods":[{"sl":43}],"name":"testNestedOr32","pass":true,"statements":[{"sl":44},{"sl":45}]},"test_200":{"methods":[{"sl":43}],"name":"testLinenoFor281","pass":false,"statements":[{"sl":44},{"sl":45}]},"test_240":{"methods":[{"sl":43},{"sl":77}],"name":"testParseNewline3112","pass":true,"statements":[{"sl":44},{"sl":45},{"sl":78}]},"test_94":{"methods":[{"sl":43},{"sl":58},{"sl":77}],"name":"testParseNoAlias29","pass":true,"statements":[{"sl":44},{"sl":45},{"sl":61},{"sl":62},{"sl":78}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [100, 94, 240, 200], [100, 94, 240, 200], [100, 94, 240, 200], [], [], [], [], [], [], [], [], [], [], [], [], [94], [], [], [94], [94], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [94, 240], [94, 240], [], [], [], [], [], [], [], [], [], [], [], [], []]

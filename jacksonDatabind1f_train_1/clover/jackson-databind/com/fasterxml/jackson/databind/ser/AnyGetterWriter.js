var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":23571,"methods":[{"el":32,"sc":5,"sl":26},{"el":46,"sc":5,"sl":34},{"el":52,"sc":5,"sl":49}],"name":"AnyGetterWriter","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_149":{"methods":[{"sl":26},{"sl":34},{"sl":49}],"name":"testIssue797225","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":37},{"sl":38},{"sl":41},{"sl":45},{"sl":51}]},"test_194":{"methods":[{"sl":26},{"sl":34},{"sl":49}],"name":"testAnyOnly335","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":37},{"sl":38},{"sl":41},{"sl":45},{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [149, 194], [], [], [149, 194], [149, 194], [149, 194], [], [], [149, 194], [], [], [149, 194], [149, 194], [], [], [149, 194], [], [], [], [149, 194], [], [], [], [149, 194], [], [149, 194], [], []]

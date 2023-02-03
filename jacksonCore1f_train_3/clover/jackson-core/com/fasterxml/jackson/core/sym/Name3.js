var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":3976,"methods":[{"el":21,"sc":5,"sl":15},{"el":25,"sc":5,"sl":24},{"el":29,"sc":5,"sl":28},{"el":38,"sc":5,"sl":31}],"name":"Name3","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_132":{"methods":[{"sl":15}],"name":"testIssue3458","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_17":{"methods":[{"sl":15}],"name":"testSingleQuotesEnabled5","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_72":{"methods":[{"sl":15},{"sl":31}],"name":"testStreamReaderParser33","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":34}]},"test_82":{"methods":[{"sl":15}],"name":"testNonStandardNameChars32","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [72, 82, 132, 17], [], [72, 82, 132, 17], [72, 82, 132, 17], [72, 82, 132, 17], [72, 82, 132, 17], [], [], [], [], [], [], [], [], [], [], [72], [], [], [72], [], [], [], [], []]

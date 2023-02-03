var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":13402,"methods":[{"el":21,"sc":5,"sl":15},{"el":25,"sc":5,"sl":24},{"el":29,"sc":5,"sl":28},{"el":38,"sc":5,"sl":31}],"name":"Name3","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_120":{"methods":[{"sl":15}],"name":"testNonStandardNameChars30","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_129":{"methods":[{"sl":15},{"sl":31}],"name":"testStreamReaderParser31","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":34}]},"test_130":{"methods":[{"sl":15}],"name":"testSpecExampleSkipping49","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_24":{"methods":[{"sl":15}],"name":"testNameEscaping14","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_62":{"methods":[{"sl":15}],"name":"testSpecExampleFully89","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_83":{"methods":[{"sl":15}],"name":"testSyntheticWithBytes28","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_93":{"methods":[{"sl":15}],"name":"testIssue3457","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [83, 93, 120, 130, 129, 24, 62], [], [83, 93, 120, 130, 129, 24, 62], [83, 93, 120, 130, 129, 24, 62], [83, 93, 120, 130, 129, 24, 62], [83, 93, 120, 130, 129, 24, 62], [], [], [], [], [], [], [], [], [], [], [129], [], [], [129], [], [], [], [], []]

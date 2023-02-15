var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":0,"methods":[{"el":21,"sc":5,"sl":17},{"el":25,"sc":5,"sl":23},{"el":33,"sc":5,"sl":31},{"el":37,"sc":5,"sl":35},{"el":41,"sc":5,"sl":39}],"name":"XmlDeclaration","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_30":{"methods":[{"sl":17}],"name":"testNewsHomepage","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]},"test_32":{"methods":[{"sl":17}],"name":"testYahooJp","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]},"test_57":{"methods":[{"sl":17},{"sl":31},{"sl":35}],"name":"parsesComments","pass":false,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":32},{"sl":36}]},"test_86":{"methods":[{"sl":17}],"name":"testGoogleSearchIpod","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [86, 30, 32, 57], [86, 30, 32, 57], [86, 30, 32, 57], [86, 30, 32, 57], [], [], [], [], [], [], [], [], [], [], [57], [57], [], [], [57], [57], [], [], [], [], [], []]

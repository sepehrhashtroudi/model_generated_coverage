var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":909,"methods":[{"el":18,"sc":5,"sl":15},{"el":22,"sc":5,"sl":20},{"el":30,"sc":5,"sl":28},{"el":35,"sc":5,"sl":32},{"el":39,"sc":5,"sl":37}],"name":"Comment","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_30":{"methods":[{"sl":15}],"name":"testNewsHomepage","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_32":{"methods":[{"sl":15}],"name":"testYahooJp","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_86":{"methods":[{"sl":15}],"name":"testGoogleSearchIpod","pass":true,"statements":[{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [86, 32, 30], [86, 32, 30], [86, 32, 30], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

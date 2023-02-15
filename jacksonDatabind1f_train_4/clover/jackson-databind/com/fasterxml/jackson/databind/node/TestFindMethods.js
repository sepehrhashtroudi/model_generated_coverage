var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":37074,"methods":[{"el":23,"sc":1,"sl":14},{"el":36,"sc":1,"sl":26},{"el":50,"sc":5,"sl":44}],"name":"TestFindMethods","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_114":{"methods":[{"sl":14},{"sl":44}],"name":"testNonMatching94","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":46},{"sl":49}]},"test_224":{"methods":[{"sl":26},{"sl":44}],"name":"testMatchingSingle194","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":46},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [114], [114], [114], [114], [114], [114], [114], [114], [114], [], [], [], [224], [224], [224], [224], [224], [224], [224], [224], [224], [224], [], [], [], [], [], [], [], [], [224, 114], [], [224, 114], [], [], [224, 114], [], []]

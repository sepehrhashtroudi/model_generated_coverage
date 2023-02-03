var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":40200,"methods":[{"el":23,"sc":1,"sl":14},{"el":42,"sc":1,"sl":26},{"el":55,"sc":1,"sl":45},{"el":69,"sc":5,"sl":63}],"name":"TestFindMethods","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_168":{"methods":[{"sl":14},{"sl":63}],"name":"testNonMatching97","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":65},{"sl":68}]},"test_327":{"methods":[{"sl":26},{"sl":63}],"name":"testMatchingMultiple98","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":65},{"sl":68}]},"test_65":{"methods":[{"sl":45},{"sl":63}],"name":"testMatchingSingle199","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":65},{"sl":68}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [168], [168], [168], [168], [168], [168], [168], [168], [168], [], [], [], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [], [], [], [65], [65], [65], [65], [65], [65], [65], [65], [65], [65], [], [], [], [], [], [], [], [], [327, 65, 168], [], [327, 65, 168], [], [], [327, 65, 168], [], []]

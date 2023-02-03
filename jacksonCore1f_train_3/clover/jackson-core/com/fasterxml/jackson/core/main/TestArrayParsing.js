var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":14924,"methods":[{"el":26,"sc":1,"sl":13},{"el":40,"sc":1,"sl":29}],"name":"TestArrayParsing","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_12":{"methods":[{"sl":29}],"name":"testInvalidMissingFieldName66","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":37},{"sl":39}]},"test_65":{"methods":[{"sl":13}],"name":"testInvalidExtraComma56","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":23},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [65], [65], [65], [65], [65], [65], [65], [65], [], [], [65], [], [65], [], [], [], [12], [12], [12], [12], [12], [12], [], [], [12], [], [12], [], [], [], [], [], [], [], [], [], []]

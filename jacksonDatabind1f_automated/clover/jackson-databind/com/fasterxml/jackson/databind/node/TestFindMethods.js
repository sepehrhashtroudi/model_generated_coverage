var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":34766,"methods":[{"el":29,"sc":1,"sl":13},{"el":40,"sc":1,"sl":30},{"el":53,"sc":5,"sl":47}],"name":"TestFindMethods","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_59":{"methods":[{"sl":30},{"sl":47}],"name":"testMatchingSingle141","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":49},{"sl":52}]},"test_84":{"methods":[{"sl":13},{"sl":47}],"name":"testMatchingMultiple56","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":49},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [84], [84], [84], [84], [84], [84], [84], [84], [84], [84], [84], [84], [84], [84], [84], [84], [], [59], [59], [59], [59], [59], [59], [59], [59], [59], [59], [], [], [], [], [], [], [], [84, 59], [], [84, 59], [], [], [84, 59], [], []]

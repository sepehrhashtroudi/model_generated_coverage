var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":57,"id":39291,"methods":[{"el":23,"sc":1,"sl":14},{"el":42,"sc":1,"sl":26},{"el":56,"sc":5,"sl":50}],"name":"TestFindMethods","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_255":{"methods":[{"sl":26},{"sl":50}],"name":"testMatchingMultiple109","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":52},{"sl":55}]},"test_457":{"methods":[{"sl":14},{"sl":50}],"name":"testNonMatching108","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":52},{"sl":55}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [457], [457], [457], [457], [457], [457], [457], [457], [457], [], [], [], [255], [255], [255], [255], [255], [255], [255], [255], [255], [255], [255], [255], [255], [255], [255], [255], [], [], [], [], [], [], [], [], [255, 457], [], [255, 457], [], [], [255, 457], [], []]

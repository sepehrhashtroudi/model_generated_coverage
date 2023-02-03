var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":99,"id":33380,"methods":[{"el":43,"sc":1,"sl":33},{"el":58,"sc":1,"sl":46},{"el":72,"sc":1,"sl":61},{"el":86,"sc":1,"sl":75}],"name":"TestTreeDeserialization","sl":11},{"el":20,"id":33380,"methods":[{"el":18,"sc":9,"sl":18},{"el":19,"sc":9,"sl":19}],"name":"TestTreeDeserialization.Bean","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_123":{"methods":[{"sl":33}],"name":"testReadFromString217","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42}]},"test_39":{"methods":[{"sl":61}],"name":"testArrayNodeEquality455","pass":true,"statements":[{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71}]},"test_512":{"methods":[{"sl":75}],"name":"testObjectNodeEquality562","pass":true,"statements":[{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85}]},"test_522":{"methods":[{"sl":46}],"name":"testNullHandling305","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [123], [123], [123], [123], [123], [123], [123], [123], [123], [123], [], [], [], [522], [522], [522], [522], [522], [522], [522], [522], [522], [522], [522], [522], [], [], [], [39], [39], [39], [39], [39], [39], [39], [39], [39], [39], [39], [], [], [], [512], [512], [512], [512], [512], [512], [512], [512], [512], [512], [512], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":86,"id":32428,"methods":[{"el":69,"sc":1,"sl":52},{"el":81,"sc":1,"sl":72}],"name":"TestViewDeserialization","sl":7},{"el":16,"id":32428,"methods":[],"name":"TestViewDeserialization.ViewA","sl":16},{"el":17,"id":32428,"methods":[],"name":"TestViewDeserialization.ViewAA","sl":17},{"el":18,"id":32428,"methods":[],"name":"TestViewDeserialization.ViewB","sl":18},{"el":19,"id":32428,"methods":[],"name":"TestViewDeserialization.ViewBB","sl":19},{"el":33,"id":32428,"methods":[{"el":32,"sc":9,"sl":31}],"name":"TestViewDeserialization.Bean","sl":21},{"el":41,"id":32430,"methods":[],"name":"TestViewDeserialization.DefaultsBean","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_13":{"methods":[{"sl":31},{"sl":52}],"name":"testSimple301","pass":true,"statements":[{"sl":32},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68}]},"test_419":{"methods":[{"sl":72}],"name":"testWithoutDefaultInclusion374","pass":true,"statements":[{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [13], [13], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [], [], [], [419], [419], [419], [419], [419], [419], [419], [419], [419], [], [], [], [], [], []]

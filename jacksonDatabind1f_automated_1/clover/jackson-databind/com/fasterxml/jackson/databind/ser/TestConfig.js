var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":81,"id":32990,"methods":[{"el":80,"sc":5,"sl":78}],"name":"TestConfig","sl":15},{"el":26,"id":32990,"methods":[],"name":"TestConfig.Config","sl":26},{"el":28,"id":32990,"methods":[],"name":"TestConfig.ConfigNone","sl":28},{"el":34,"id":32990,"methods":[{"el":31,"sc":9,"sl":31},{"el":33,"sc":9,"sl":32}],"name":"TestConfig.AnnoBean","sl":30},{"el":38,"id":32994,"methods":[],"name":"TestConfig.Indentable","sl":36},{"el":42,"id":32994,"methods":[],"name":"TestConfig.SimpleBean","sl":40}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":94,"id":30771,"methods":[{"el":64,"sc":1,"sl":42},{"el":89,"sc":1,"sl":67}],"name":"TestScalars","sl":9},{"el":18,"id":30771,"methods":[{"el":16,"sc":9,"sl":15},{"el":17,"sc":9,"sl":17}],"name":"TestScalars.DynamicWrapper","sl":11},{"el":20,"id":30774,"methods":[],"name":"TestScalars.TestEnum","sl":20},{"el":29,"id":30774,"methods":[{"el":27,"sc":9,"sl":26},{"el":28,"sc":9,"sl":28}],"name":"TestScalars.AbstractWrapper","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_314":{"methods":[{"sl":26},{"sl":28},{"sl":42}],"name":"testScalarsViaAbstractType42","pass":true,"statements":[{"sl":28},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63}]},"test_567":{"methods":[{"sl":15},{"sl":17},{"sl":67}],"name":"testScalarsWithTyping48","pass":true,"statements":[{"sl":17},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [567], [], [567], [], [], [], [], [], [], [], [], [314], [], [314], [], [], [], [], [], [], [], [], [], [], [], [], [], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [314], [], [], [], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [567], [], [], [], [], [], []]

var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":71,"id":14048,"methods":[{"el":27,"sc":1,"sl":13},{"el":37,"sc":1,"sl":30},{"el":57,"sc":1,"sl":40}],"name":"TestJsonFormatDetection","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_57":{"methods":[{"sl":30}],"name":"testSimpleInvalid42","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_62":{"methods":[{"sl":13}],"name":"testSimpleValidString32","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_96":{"methods":[{"sl":40}],"name":"testSimpleValidObject102","pass":true,"statements":[{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [62], [62], [62], [62], [62], [62], [62], [62], [62], [62], [62], [62], [62], [62], [], [], [], [57], [57], [57], [57], [57], [57], [57], [], [], [], [96], [96], [96], [96], [96], [96], [96], [96], [96], [96], [96], [96], [96], [96], [96], [96], [96], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

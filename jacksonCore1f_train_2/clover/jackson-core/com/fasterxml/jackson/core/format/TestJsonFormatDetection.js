var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":16586,"methods":[{"el":29,"sc":1,"sl":13},{"el":46,"sc":1,"sl":32},{"el":56,"sc":1,"sl":49}],"name":"TestJsonFormatDetection","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_119":{"methods":[{"sl":49}],"name":"testSimpleInvalid45","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55}]},"test_123":{"methods":[{"sl":32}],"name":"testSimpleValidString34","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45}]},"test_13":{"methods":[{"sl":13}],"name":"testSimpleValidArray17","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [], [], [], [123], [123], [123], [123], [123], [123], [123], [123], [123], [123], [123], [123], [123], [123], [], [], [], [119], [119], [119], [119], [119], [119], [119], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

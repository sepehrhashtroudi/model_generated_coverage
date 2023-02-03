var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":15542,"methods":[{"el":29,"sc":1,"sl":13},{"el":39,"sc":1,"sl":32},{"el":59,"sc":1,"sl":42}],"name":"TestJsonFormatDetection","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_109":{"methods":[{"sl":42}],"name":"testSimpleValidObject104","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58}]},"test_127":{"methods":[{"sl":32}],"name":"testSimpleInvalid44","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38}]},"test_87":{"methods":[{"sl":13}],"name":"testSimpleValidArray15","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [87], [87], [87], [87], [87], [87], [87], [87], [87], [87], [87], [87], [87], [87], [87], [87], [], [], [], [127], [127], [127], [127], [127], [127], [127], [], [], [], [109], [109], [109], [109], [109], [109], [109], [109], [109], [109], [109], [109], [109], [109], [109], [109], [109], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":110,"id":15237,"methods":[{"el":22,"sc":9,"sl":19},{"el":27,"sc":9,"sl":24},{"el":32,"sc":9,"sl":29},{"el":53,"sc":1,"sl":41},{"el":79,"sc":1,"sl":56},{"el":94,"sc":1,"sl":82}],"name":"TestCharEscaping","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":41}],"name":"testInvalid115","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":50},{"sl":52}]},"test_91":{"methods":[{"sl":56}],"name":"testSimpleEscaping116","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78}]},"test_96":{"methods":[{"sl":24},{"sl":82}],"name":"testWriteLongCustomEscapes123","pass":true,"statements":[{"sl":26},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [96], [], [96], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [11], [11], [11], [11], [11], [11], [11], [], [], [11], [], [11], [], [], [], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [91], [], [], [], [96], [96], [96], [96], [96], [96], [], [96], [96], [96], [96], [96], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

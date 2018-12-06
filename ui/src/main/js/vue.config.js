module.exports = { // https://cli.vuejs.org/config/#baseurl
  baseUrl: process.env.NODE_ENV === 'production'
    ? '/ui/'
    : './'
};
